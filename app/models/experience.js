import DS from 'ember-data';

export default DS.Model.extend({
  company: DS.attr('string'),
  timePeriod: DS.attr('string'),
  positions: DS.hasMany('position')
});
