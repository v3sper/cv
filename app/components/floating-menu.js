import Ember from 'ember';

export default Ember.Component.extend({
  actions: {
    print: function(){
      window.print();
    },

    github: function(){
      window.open("https://github.com/v3sper");
    },

    linkedin: function(){
      window.open("https://pl.linkedin.com/pub/patryk-stępień/62/48b/a39");
    },

    contact: function(){
      window.location.href = "mailto:patryk90.stepien@gmail.com";
    }
  }
});
