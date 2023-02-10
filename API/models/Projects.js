const mongoose = require('mongoose');
const ProjectsSchema = mongoose.Schema({
    image: String,
    link: String,
});

module.exports = mongoose.model('Projects', ProjectsSchema);