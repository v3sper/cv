import DS from 'ember-data';
import Ember from 'ember';

export default DS.Adapter.extend({
  findRecord: function(store, type, id){
    return new Ember.RSVP.Promise(function(resolve, reject){
      Ember.$.getJSON("cv/" + type.modelName + "/" + id).then(function(data){
        Ember.run(null, resolve, data);
      }, function(jqXHR){
        jqXHR.then = null;
        Ember.run(null, reject, jqXHR);
      });
    });
  }
});
