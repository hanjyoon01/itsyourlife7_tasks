<script>
import FirstChild from './components/FirstChild.vue';

export default {
  // Options API
  components: { FirstChild },
  data() {
    return {
      visible: true,
    };
  },
  beforeCreate() {
    console.log('bC');
  },
  created() {
    setTimeout(() => {
      this.visible = false;
    }, 2000);
    console.log('C');
  },
  beforeMount() {
    console.log('bM');
  },
  mounted() {
    console.log('M');
  },
  beforeUpdate() {
    console.log('bU');
  },
  updated() {
    console.log('U');
  },
  beforeUnmount() {
    console.log('bUM');
  },
  Unmounted() {
    console.log('UM');
  },
};
</script>

<template>
  <FirstChild v-if="visible" />
</template>
