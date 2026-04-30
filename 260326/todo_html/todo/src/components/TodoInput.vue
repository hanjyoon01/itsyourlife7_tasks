<!-- 
  입력창에 할 일 입력 + Enter/Click => 입력 내용 저장
  1. 데이터 정의 (사용자 입력 내용)
  2. v-model 디렉티브 입력창과 양방향 데이터 바인딩
  3. 입력창에서 Enter/Click 시 사용자 입력값을 확인하는 이벤트 등록
-->
<script>
export default {
  data() {
    return {
      inputMsg: '', // 입력 todo 데이터 정의
    };
  },

  emits: ['addTodo'],
  methods: {
    addTodo() {
      // console.log(this.inputMsg);
      this.$emit('addTodo', this.inputMsg); // 부모 컴포넌트 이벤트 호출
      this.inputMsg = '';
    },
  },
};
</script>

<template>
  <div class="todo__input">
    <!-- 정의한 inputMsg를 양방향 데이터 바인딩 -->
    <input
      v-model="inputMsg"
      type="text"
      class="todo__input-text"
      placeholder="할 일을 입력하세요."
      @keydown.enter="addTodo"
    />
    <button class="todo__input-btn" @click="addTodo">등록</button>
  </div>
</template>
