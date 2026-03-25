<!-- @print-hello 이벤트 발신 시 문자열 변수, 숫자형 값을 매개변수로 하는 코드 작성 -->
<script>
import UserProfile from './components/UserProfile.vue';

export default {
  components: {
    UserProfile,
  },

  methods: {
    printHello(name, age) {
      alert(`이름: ${name}, 나이: ${age}`);
    },
  },
};
</script>
<template>
  <UserProfile @print-hello="(name, age) => printHello(name, age)" />
</template>
