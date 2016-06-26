import Ember from 'ember';

export function rangeGen(params/*, hash*/) {
  return params;
}

export default Ember.HTMLBars.makeBoundHelper(function(values) {
  var start = values[0];
  var count = values[1];

  var ret = [];
  for(var i = 0; i < count; i++) {
    ret.push(i+start);
  }
  return ret;
});
