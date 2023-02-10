const mongoose = require('mongoose');
const BlogsSchema = mongoose.Schema({
    image: String,
    title: String,
    writer: String,
    description: String,
    link: String,
    date: String,
    filter: String,
});

module.exports = mongoose.model('Blogs', BlogsSchema);