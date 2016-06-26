import DS from 'ember-data';

export default DS.Transform.extend({
  deserialize: function(serialized) {
    var birthdayMoment = moment(serialized, 'DD-MM-YYYY', 'en');
    var years = moment().diff(birthdayMoment, 'years');
    var formatedBirthday = birthdayMoment.format('DD MMM YYYY');
    return `${formatedBirthday} (${years})`;
  }
});
