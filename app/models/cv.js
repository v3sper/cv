import DS from 'ember-data';
import Ember from 'ember';

export default DS.Model.extend({
  profile: DS.belongsTo('profile'),
  experience: DS.hasMany('experience'),
  education: DS.hasMany('experience'),
  skills: DS.belongsTo('skill-container'),
  name: Ember.computed('profile.name', function(){
    var profile = this.get('profile');
    var name = profile.get('name');
    return name;
  })
});
