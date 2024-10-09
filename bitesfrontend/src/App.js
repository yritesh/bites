import React, {useEffect, useState} from "react";
import axios from "axios";

function App(){
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/test/")
      .then(response => {
        setPosts(response.data);
      })
      .catch(error => {
        console.error("Error!", error);
      });
  }, []);

  return (
    <div className="App">
      <h1>Blog Posts</h1>
      <ul>
        {posts.map((post, index) => (
          <li key={index}>{post}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;