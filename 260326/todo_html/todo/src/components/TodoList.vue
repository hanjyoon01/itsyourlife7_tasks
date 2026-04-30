<script>
export default {
  props: {
    computedTodo: {
      type: Array,
      default() {
        return [];
      },
    },
  },
  methods: {
    deleteTodo(id) {
      this.$emit('delete-todo', id);
    },
    updateTodo(id) {
      this.$emit('update-todo', id);
    },
  },
};
</script>

<template>
  <div class="todo__list">
    <!-- 할 일 목록이 있을 때 (완료 시 .todo__item--completed 클래스 추가 )-->

    <div
      v-for="item in computedTodo"
      :key="item.id"
      class="todo__item"
      :class="{ 'todo__item--completed': item.completed }"
    >
      <input
        type="checkbox"
        :id="item.id"
        :checked="item.completed"
        @click="updateTodo(item.id)"
      />
      <label :for="item.id" class="todo__checkbox-label"></label>
      <span class="todo__item-text">{{ item.input }}</span>
      <span
        class="material-symbols-outlined todo__delete-icon"
        @click="deleteTodo(item.id)"
        style="cursor: pointer"
      >
        delete
      </span>
    </div>

    <!-- 할 일 목록이 없을 때 -->
    <div class="todo__item--no" v-if="computedTodo.length === 0">
      <p>할일 목록이 없습니다.</p>
    </div>
  </div>
</template>
