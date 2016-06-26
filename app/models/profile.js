import DS from 'ember-data';
import Ember from 'ember';

export default DS.Model.extend({
  name: DS.attr('string'),
  birthday: DS.attr('moment-birthday'),
  location: DS.attr('string'),
  phone: DS.attr('string'),
  email: DS.attr('string'),
  website: DS.attr('string'),
  attributes: Ember.computed('name', function(){
    var attrNames = [];
    this.eachAttribute((name) => attrNames.push(name));
    var attrs = Ember.getProperties(this, attrNames);
    return attrs;
  })
});
