import Ember from 'ember';

export default Ember.Component.extend({
  phoneNumber: null,
  clicked: false,

  phoneNumberFirstPart: Ember.computed('phoneNumber', 'clicked', function() {
    var phoneNumber = this.get('phoneNumber');
    if(phoneNumber==null || this.get('clicked')){
      return phoneNumber;
    }
    return phoneNumber.substring(0, 7) + ' XXX XXX';
  }),

  actions: {
    showNumber() {
      this.set('clicked', true);
    }
  }
});
