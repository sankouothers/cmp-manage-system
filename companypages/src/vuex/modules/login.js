import api from '../../api';
import * as types from '../mutation-types'

export default {
  state: {
    loginForm:{
      userName: null,
      passWord: null
    }
  },
  actions: {
    loginCheck({commit}, loginForm) {
      return new Promise((resolve, reject) => {
        api.login(loginForm)
          .then(res => {
            commit(types.LOGIN, res);
            resolve(res);
          })
          .catch(err => {
            reject(err);
          });
      });
    },
  },
  mutations: {
    [types.LOGIN](state, res) {
    }
  }

};

