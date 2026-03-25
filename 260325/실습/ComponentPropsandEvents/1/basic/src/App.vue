<!-- 
    부모 컴포넌트에서 사용자 정의 이벤트 사용 여부에 관계 없이 
    모든 컴포넌트에 $emit() 내장 메서드를 사용하여 부모 컴포넌트로 이벤트 발신 가능
    자식들의 무분별한 컴포넌트 발신 제어를 위한 발신 가능 이벤트 명시 필요
-->
<script>
import UserProfile from './components/UserProfile.vue';

export default {
  components: { UserProfile },
  methods: {
    printHello() {
      alert('안녕하세요');
    },
  },
};
</script>
<template>
  <UserProfile @print-hello="printHello" />
</template>
