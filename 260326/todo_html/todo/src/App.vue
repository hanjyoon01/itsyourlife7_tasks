<!-- 
  컴포넌트 여러 개 => 각각 자신의 기능 수행
  관리자 : App.vue
  1. App 컴포넌트 => method 속성으로 addTodo() 함수 정의
    매개변수로 할 일을 받는 기능
  2. 입력 받은 텍스트로 목록 구성 (객체 데이터 생성)
    할일 목록 객체는 id(고유값), msg(할 일), completed(완료 여부)
    { id: 1 , msg: '', completed: false }
  3. 할일 목록 관리 자료구조 정의 => todo : []
  4. 객체 데이터를 todo 데이터에 추가하는 기능 => todo [] => push()
  5. method 옵션 속성으로 정의한 addTodo() v-on,으로 TodoInput에 전달
  ---------------------------------------
  할일 목록 필터링
  1. 현재 목록 상태를 관리할 수 있는 데이터 정의 => current
-->

<script>
import TodoHeader from './components/TodoHeader.vue';
import TodoList from './components/TodoList.vue';
import TodoInput from './components/TodoInput.vue';

export default {
  data() {
    return {
      todo: [],
      current: 'all',
    };
  },
  components: { TodoHeader, TodoList, TodoInput },
  methods: {
    addTodo(inputMsg) {
      const item = {
        id: Math.random(),
        input: inputMsg,
        completed: false,
      };
      this.todo.push(item);
    },
    updateTab(tab) {
      this.current = tab;
    },
    deleteTodo(id) {
      this.todo = this.todo.filter((item) => item.id !== id);
    },
    updateTodo(id) {
      this.todo = this.todo.map((v) =>
        v.id === id ? { ...v, completed: !v.completed } : v,
      );
    },
  },
  computed: {
    computedTodo() {
      if (this.current === 'all') {
        return this.todo;
      } else {
        return this.todo.filter((v) => v.completed);
      }
    },
  },
};
</script>

<template>
  <div class="todo">
    <TodoHeader :current="current" @update-tab="updateTab" />
    <TodoList
      :computed-todo="computedTodo"
      @delete-todo="deleteTodo"
      @update-todo="updateTodo"
    />
    <TodoInput @add-todo="addTodo" />
  </div>
</template>

<style></style>
