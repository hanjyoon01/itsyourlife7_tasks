<!-- 
  v-for 내장함수를 이용해서 이터러블 객체에 대해 반복적으로 블록을 생성할 수 있다.
-->

<template>
  <div style="width: 200px">
    <ol>
      <li v-for="item in items">{{ item }}</li>
    </ol>
  </div>
</template>

<script>
import { reactive } from 'vue';

export default {
  // Composition API
  setup() {
    const items = reactive({ 1: '1번 객체', 2: '2번 객체', 3: '3번 객체' });
    return {
      items,
    };
  },
};
</script>
