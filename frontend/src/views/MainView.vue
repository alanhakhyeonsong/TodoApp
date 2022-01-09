<template>
  <div class="todoApp">
    <h1>hello</h1>
  </div>
</template>

<script>
import {getTodos} from "@/api";

export default {
  name: "MainView",
  methods: {
    fun: function () {
      getTodos()
    }
  }
}


</script>

<style scoped>

</style>