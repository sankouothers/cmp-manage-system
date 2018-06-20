import {doPost} from './axios/util';
import URLS from "./urls";

export default {
  login(loginFrom) {
    return doPost(URLS.LOGIN,loginFrom);
  },
};
