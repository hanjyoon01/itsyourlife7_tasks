<script>
export default {
  emits: [`print-hello`],
  methods: {
    parentEventCall() {
      // this.$emit('print-hello');
      this.$emit(`onPrint-hello`);
    },
  },
};
</script>
<template>
  <!-- <button @click="$emit('print-hello')">Click</button> -->
  <button @click="parentEventCall">Click</button>
</template>
