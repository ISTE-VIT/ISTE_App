const mongoose = require('mongoose');
const AnnouncementsSchema = mongoose.Schema({
    image: String,
    title: String,
    description: String,
    author: String,
    link: String,
    time: String,
    date: String,
    platform: String,
    category: String,
    type: String
});

module.exports = mongoose.model('Announcements', AnnouncementsSchema);