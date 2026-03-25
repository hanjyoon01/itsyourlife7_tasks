<script>
import FirstChild from './components/FirstChild.vue';

export default {
  components: {
    FirstChild,
  },
  mounted() {
    const childNum = this.$refs.child.num;
    const childDoubleNum = this.$refs.child.doubleNum;
    console.log(`메서드 호출 전: ${childNum}`);
    console.log(`메서드 호출 후: ${childDoubleNum}`);

    setTimeout(() => {
      this.$refs.child.increment();

      console.log(`메서드 호출 전: ${childNum}`);
      console.log(`메서드 호출 후: ${childDoubleNum}`);
    }, 3000);
  },
};
</script>

<template>
  <FirstChild ref="child" />
</template>

<!-- <script>
export default {
  data() {
    return {
      doc: null,
    };
  },
};
// const doc = document.querySelector('h1');
// const txt = doc.innerText;
// console.log(txt);
</script>
<template>
  <h1>H1 태그</h1>
  <h1>{{ num }}</h1>
</template> -->
