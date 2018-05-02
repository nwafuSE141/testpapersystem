<template>
  <div>
    <app-header v-on:titleChanged="updateTitle($event)" v-bind:title="title"></app-header>
    <users v-bind:users="users"></users>
    <app-footer v-bind:title="title"></app-footer>
  </div>
</template>

<script>
import Users from "./Users";
import Header from "./Header";
import Footer from "./Footer";

export default {
  name: "home",
  data() {
    return {
      users: [],
      title: "传递的是值(number string boolean)"
    };
  },
  components: {
    "users": Users, // Users
    "app-header": Header,
    "app-footer": Footer
  },
  methods: {
    updateTitle(title) {
      this.title = title;
    }
  },
  created() {
    this.$http.get("http://jsonplaceholder.typicode.com/users").then(data => {
      // console.log(data);
      this.users = data.body;
    });
  }
};
</script>

<style scoped>
h1 {
  color: purple;
}
</style>
