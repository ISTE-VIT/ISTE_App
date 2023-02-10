const mongoose = require('mongoose');

const ResourcesLinks = mongoose.Schema({
    topic: String,
    links: [String]
});

const ResourcesSchema = mongoose.Schema({
    title: String,
    roadmap: String,
    topics: [ResourcesLinks]
});

module.exports = mongoose.model('Resources', ResourcesSchema);