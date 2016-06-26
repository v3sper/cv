import DS from 'ember-data';
import Ember from 'ember';

export default DS.Model.extend({
  theoretical: DS.hasMany('skill'),
  technical: DS.hasMany('skill'),
  attributes: Ember.computed('theoretical', 'technical', function(){
    var attrNames = [];
    this.eachRelationship((name) => attrNames.push(name));
    var attrs = Ember.getProperties(this, attrNames);
    return attrs;
  })
});
