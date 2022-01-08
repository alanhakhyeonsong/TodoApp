<template>
  <div id="app">
    <ToolBar></ToolBar>
    <MainView></MainView>
  </div>
</template>

<script>
import ToolBar from "@/components/ToolBar";
import MainView from "@/views/MainView";

export default {
  name: 'App',
  components: {
    ToolBar,
    MainView,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
