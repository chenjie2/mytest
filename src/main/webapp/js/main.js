require.config({
　　　　baseUrl: "jslib",
　　　　paths: {
　　　　　　"jquery": "jquery/jquery.min",
　　　　　　"underscore": "underscore/underscore.min",
　　　　　　"backbone": "backbone/backbone.min"
　　　　}
　　});

require(['jquery', 'underscore', 'backbone'], function ($, _, Backbone){
　　　　// some code here
　　});