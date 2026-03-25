<!-- 
    컴포넌트에 속성과 이벤트 정의 방법
    컴포넌트에 속성 정의 => 사용자 정의 속성
    컴포넌트에 이벤트 정의 -> 사용자 정의 이벤트
    컴포넌트에 원하는 값 전달
    UserProfile 컴포넌트의 name 속성, age 속성 정의
    UserProfile 컴포넌트로 name, age 값 전달
-->

<script>
import UserProfile from './components/UserProfile.vue';

export default {
  components: {
    UserProfile,
  },
  data() {
    return {
      name: '김철수',
      age: 30,
    };
  },
};
</script>
<template>
  <!-- 정의한 사용자 정의 속성값 name, age를 UserProfile에 전달 -->
  <UserProfile :name="`김나박`" :age="20" />
  <UserProfile :name="name" :age="age" />
</template>
