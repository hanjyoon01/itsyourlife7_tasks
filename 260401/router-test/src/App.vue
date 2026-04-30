<template>
  <div class="container">
    <Header />
    <router-view />
  </div>
</template>

<script setup>
import Header from '@/components/Header.vue';
</script>

<style>
.container {
  text-align: center;
  margin-top: 10px;
}

.card {
  margin-top: 10px;
}
</style>
