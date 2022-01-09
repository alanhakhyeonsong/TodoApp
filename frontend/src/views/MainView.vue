<template>
  <div class="todoApp">
    <h1>hello</h1>
    <div>
      <button v-on:click="getData">test</button>
    </div>
  </div>
</template>

<script>
import {getTodos} from "@/api";

export default {
  name: "MainView",
  methods: {
    getData: function () {
      getTodos().then(response => {
        console.log(response.data);
      })
          .catch(error => {
            console.log(error);
          });
    }
  },
  created() {

  }
}


</script>

<style scoped>

</style>