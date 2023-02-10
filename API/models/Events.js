const mongoose = require('mongoose');
const EventsSchema = mongoose.Schema({
    image: String,
    title: String,
    speaker: String,
    description: String,
    time: String,
    date: String,
    platform: String,
    link: String,
    category: String,
    filter: String,
});

module.exports = mongoose.model('Events', EventsSchema);