<template>
    <div>{{ count }}</div>
</template>
<script>
  export default {
    name:"count",
    data(){
      return{
        count:0
      };
    },
    methods:{
      increment(state){
        this.count++
      }
    }
  }
</script>
<style>

</style>
