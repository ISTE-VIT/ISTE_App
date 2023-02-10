const mongoose = require('mongoose');
const CarouselSchema = mongoose.Schema({
    image: String,
    title: String
});

module.exports = mongoose.model('Carousel', CarouselSchema);