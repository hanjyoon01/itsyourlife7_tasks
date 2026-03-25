<script>
export default {
  methods: {
    parentEventCall() {
      this.$emit('print-hello');
    },
  },
};
</script>
<template>
  <button @click="$emit('print-hello')">Click</button>
  <button @click="parentEventCall">Click</button>
</template>
