<script>
export default {
  props: ['name', 'age'],
  created() {
    console.log(typeof this.age);
    console.log(typeof this.name);
  },
};
</script>
<template>
  <p>이름 : {{ name }}</p>
  <p>이름 : {{ age }}</p>
</template>
