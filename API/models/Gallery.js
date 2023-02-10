const mongoose = require('mongoose');
const GallerySchema = mongoose.Schema({
    image: String,
});

module.exports = mongoose.model('Gallery', GallerySchema);