<!-- 
  setup()을 통해 설정한 date 문자열 : 인스턴스에 접근 불가  
  Option API를 통해 설정한 date 문자열 : this를 통해 반응형 데이터 객체에 접근 가능
-->

<template>
  <div id="date">
    {{ date }}
  </div>
  <div id="date2">
    {{ date2 }}
  </div>
</template>

<script>
export default {
  // Composition API
  setup() {
    const date = Date().toString();
    return {
      date,
    };
  },

  // Option API
  data() {
    return {
      date2: Date().toString(),
    };
  },
};
</script>
