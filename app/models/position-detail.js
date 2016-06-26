import DS from 'ember-data';
import Ember from 'ember';

export default DS.Model.extend({
  name: DS.attr('string'),
  startDate: DS.attr('moment'),
  endDate: DS.attr('moment'),
  timePeriod: Ember.computed('startDate', 'endData', function(){
    if(this.get('startDate') == null || this.get('endDate') == null){
      return "";
    }
    return this.get('startDate').to(this.get('endDate'), true);
  })
});
