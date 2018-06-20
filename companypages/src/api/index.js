import axios from "axios";
import login from './login';


axios.defaults.timeout = 20000;
// axios.defaults.baseURL = 'http://localhost:8083';
axios.defaults.withCredentials = true;

const api = Object.assign(login);

export default api;
