<!-- /*

$route는 현재 라우팅 상태 객체이며, URL, params 등을 포함. 디버깅 및 동적 라우팅에서 매우 중요.
*/ -->

<template>
  <div class="card card-body">
    <h2>About</h2>
    <p>요청 경로 : {{ $route.fullPath }}</p>
  </div>
</template>

<script>
export default {
  name: 'About',
  created() {
    console.log(this.$route);
  },
};
</script>
