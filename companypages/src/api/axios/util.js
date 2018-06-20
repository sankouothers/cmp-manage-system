import axios from "axios";

export function doPost(url, data, config) {
  return new Promise((resolve, reject) => {
    console.log("request data URL",url)
    axios.post(url, data, config)
      .then(response => {
        resolve(response.data);
      })
      .catch((error) => {
        reject(error)
      })
  })
};
