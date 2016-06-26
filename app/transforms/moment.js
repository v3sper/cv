import DS from 'ember-data';

export default DS.Transform.extend({
  deserialize: function(serialized) {
    if(serialized === "present"){
      return moment();
    }
    return moment(serialized, 'DD-MM-YYYY', 'en');
  }
});
