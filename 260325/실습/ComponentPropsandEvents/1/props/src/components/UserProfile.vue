<script>
export default {
  // methods: {
  //   parentEventCall() {
  //     this.$emit('print-hello', '영희', 15);
  //   },
  // },
};
</script>
<template>
  <!-- <button @click="parentEventCall">Click</button> -->
  <button @click="$emit('print-hello', '영희', 15)">Click</button>
</template>
