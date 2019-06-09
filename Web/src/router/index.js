import Vue from 'vue'
import Router from 'vue-router'
import Main from '@/components/Main'
import ListTeacher from '@/components/Teacher/ListTeacher'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main,
      children: [
        {
          path: 'listTeacher',
          name: 'ListTeacher',
          component: ListTeacher
        }
      ]
    }
  ]
})
