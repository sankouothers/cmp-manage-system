import Vue from 'vue'
import Router from 'vue-router'
import login from '@/components/login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/login4',
      name: 'login',
      component: login
    },
    {
      path: '/',
      redirect: login
    }
  ]
})
