<!-- 
  v-if (else, else-if) 내장함수를 사용하여 조건부로 요소를 렌더링할 수 있다.
-->
<template>
  <p>{{ counter }}</p>
  <p v-if="counter < 5">5보다 작습니다.</p>
  <p v-else>5와 같거나 큽니다.</p>
  <button @click="counter++">클릭하면 숫자가 올라갑니다.</button>
</template>

<script>
import { ref } from 'vue';

export default {
  // Composition API
  setup() {
    let counter = ref(0);
    return {
      counter,
    };
  },
};
</script>
