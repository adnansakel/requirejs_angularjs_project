var Suite = require('./suite');
var suite = new Suite('eles.kruskal()', {
  setup: function( cytoscape ){
    return cytoscape({ elements: require('./graphs/gal') });
  }
});

suite
  .add( function( cy ) {
    cy.elements().kruskal({
    });
  })
;

module.exports = suite;
