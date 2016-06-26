import DS from 'ember-data';

export default DS.Model.extend({
  positionDetails: DS.hasMany('position-details'),
  responsibilities: DS.attr('string')
});
