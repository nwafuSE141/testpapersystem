<template>
  <header v-on:click="changeTitle">
      <h1>{{title1}} {{title}}</h1>
  </header>
</template>
<script>
export default {
  name: "app-header",
  props: {
    title: {
      type: String
    }
  },
  data() {
    return {
      title1: "Vue.js Demo"
    };
  },
  methods: {
    changeTitle: function() {
      //   this.title = "changed"
      this.$emit("titleChanged", "子向父传值"); //定义事件
    }
  },
//   beforeCreate: function() {
//     alert("beforeCreate()组件实例化之前执行的函数");
//   },
//   created() {
//     alert("created()组件实例化完毕,页面未显示");
//   },
//   beforeMount() {
//     alert("beforeMount()组件挂在之前,页面未显示,虚拟dom已配置");
//   },
//   mounted() {
//     alert("mounted()组件挂载后,此方法执行后,页面显示");
//   },
//   beforeUpdate() {
//     alert("beforeUpdate组件更新,页面未显示,虚拟dom已配置");
//   },
//   updated() {
//     alert("updated组件更新,执行后页面显示");
//   },
//   beforeDestroy() {
//     alert("beforeDestroy组件销毁前");
//   },
//   destroyed() {
//     alert("destroyed组件销毁");
//   }
};
</script>
<<style scoped>
header{
    background: lightgreen;
    padding: 10px;
}
</style>
