<template>
  <el-container class="login-from">
    <el-form :model="loginForm" status-icon :rules="loginRule" ref="loginForm" label-width="100px" class="login-box">
      <el-form-item label="用户名" prop="userName">
        <el-input type="text" v-model="loginForm.userName" auto-complete="off"
                  @keydown.space.native="handleSpacePress">
          <i slot="prefix" class="el-input__icon el-icon-username"></i>
        </el-input>
      </el-form-item>
      <el-form-item label="密码" prop="passWord">
        <el-input type="password" v-model="loginForm.passWord" auto-complete="off"
                  @keydown.space.native="handleSpacePress"
                  @keyup.enter.native="submitForm('loginForm')">
          <i slot="prefix" class="el-input__icon el-icon-password"></i>
        </el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('loginForm')" class="login-btn">提交</el-button>
      </el-form-item>
    </el-form>
  </el-container>

</template>

<script>
  import {mapActions} from 'vuex';
  export default {
    name: 'login',
    data() {
      return {
        loginForm: {
          userName: '',
          passWord: ''
        },
        loginRule: {
          userName: [
            {required: true, message: '用户名不能为空', trigger: 'blur'}
          ],
          passWord: [
            {required: true, message: '密码不能为空', trigger: 'blur'}
          ]
        }
      };
    },
    methods: {
      ...mapActions([
        'loginCheck'
      ]),
      handleSpacePress(event) {
        event.preventDefault();
      },
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.loginCheck(this.loginForm)
              .then(res => {
                this.$router.replace({name: 'main'});
              })
              .catch(error => {
              });
          }
        });
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

  .login-box {
    margin-top: 200px;
    height: 100%;
    width: 400px;
  }

  .login-from {
    justify-content: center;
  }

  .login-btn {
    width: 100%;
  }

</style>
