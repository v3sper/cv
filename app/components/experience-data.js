import Ember from 'ember';

export default Ember.Component.extend({
  didInsertElement: function() {
    this.renderChildTooltips();
  },
  actions: {
    openCompanyWebsite: function(companyUrl){
      window.open(companyUrl);
    }
  }
});
