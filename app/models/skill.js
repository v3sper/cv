import DS from 'ember-data';

export default DS.Model.extend({
  name: DS.attr('string'),
  rating: DS.attr('number'),
  maxRating: DS.attr('number')
});
